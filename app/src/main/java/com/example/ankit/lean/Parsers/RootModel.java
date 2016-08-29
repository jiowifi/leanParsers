import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String background_image;
	public CopyrightModel _copyright;
	public String topic;
	public String privacy;
	public CreatorModel _creator;
	public String schedule_published_on;
	public int id;
	public String location_name;
	public String state;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String description;
	public String type;
	public String start_time;
	public String code_of_conduct;
	public String timezone;
	public VersionModel _version;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String email;

	public RootModel(String end_time, String background_image, CopyrightModel copyright, String topic, String privacy, CreatorModel creator, String schedule_published_on, int id, String location_name, String state, String logo, Call_for_papersModel call_for_papers, String organizer_name, String description, String type, String start_time, String code_of_conduct, String timezone, VersionModel version, String organizer_description, ArrayList<Social_linksModel> social_links, String name, String email) {

		this.end_time = end_time;
		this.background_image = background_image;
		this._copyright = copyright;
		this.topic = topic;
		this.privacy = privacy;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.location_name = location_name;
		this.state = state;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.description = description;
		this.type = type;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this._version = version;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.name = name;
		this.email = email;

	}

}