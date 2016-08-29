import java.util.ArrayList;

class RootModel {

	public String topic;
	public VersionModel _version;
	public String background_image;
	public int id;
	public String description;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String logo;
	public CopyrightModel _copyright;
	public String timezone;
	public String location_name;
	public String start_time;
	public String code_of_conduct;
	public String organizer_description;
	public String schedule_published_on;
	public String organizer_name;
	public String privacy;
	public String end_time;
	public String name;

	public RootModel(String topic, VersionModel version, String background_image, int id, String description, String type, Call_for_papersModel call_for_papers, String state, String email, ArrayList<Social_linksModel> social_links, CreatorModel creator, String logo, CopyrightModel copyright, String timezone, String location_name, String start_time, String code_of_conduct, String organizer_description, String schedule_published_on, String organizer_name, String privacy, String end_time, String name) {

		this.topic = topic;
		this._version = version;
		this.background_image = background_image;
		this.id = id;
		this.description = description;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.email = email;
		this.social_links = social_links;
		this._creator = creator;
		this.logo = logo;
		this._copyright = copyright;
		this.timezone = timezone;
		this.location_name = location_name;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.end_time = end_time;
		this.name = name;

	}

}