import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String organizer_description;
	public String organizer_name;
	public String state;
	public String code_of_conduct;
	public String location_name;
	public String background_image;
	public String description;
	public String name;
	public String logo;
	public String type;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String privacy;
	public String start_time;
	public String topic;
	public String end_time;
	public String email;

	public RootModel(String timezone, String organizer_description, String organizer_name, String state, String code_of_conduct, String location_name, String background_image, String description, String name, String logo, String type, VersionModel version, Call_for_papersModel call_for_papers, CopyrightModel copyright, String schedule_published_on, int id, ArrayList<Social_linksModel> social_links, CreatorModel creator, String privacy, String start_time, String topic, String end_time, String email) {

		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.background_image = background_image;
		this.description = description;
		this.name = name;
		this.logo = logo;
		this.type = type;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.social_links = social_links;
		this._creator = creator;
		this.privacy = privacy;
		this.start_time = start_time;
		this.topic = topic;
		this.end_time = end_time;
		this.email = email;

	}

}