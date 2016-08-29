import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String topic;
	public String privacy;
	public CopyrightModel _copyright;
	public String location_name;
	public String state;
	public String timezone;
	public String description;
	public String start_time;
	public String name;
	public String logo;
	public String background_image;
	public String organizer_name;
	public CreatorModel _creator;
	public String type;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String organizer_description;
	public int id;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String email;

	public RootModel(String end_time, String topic, String privacy, CopyrightModel copyright, String location_name, String state, String timezone, String description, String start_time, String name, String logo, String background_image, String organizer_name, CreatorModel creator, String type, VersionModel version, ArrayList<Social_linksModel> social_links, String schedule_published_on, String organizer_description, int id, String code_of_conduct, Call_for_papersModel call_for_papers, String email) {

		this.end_time = end_time;
		this.topic = topic;
		this.privacy = privacy;
		this._copyright = copyright;
		this.location_name = location_name;
		this.state = state;
		this.timezone = timezone;
		this.description = description;
		this.start_time = start_time;
		this.name = name;
		this.logo = logo;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.type = type;
		this._version = version;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.email = email;

	}

}