import java.util.ArrayList;

class RootModel {

	public String email;
	public String topic;
	public String end_time;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String logo;
	public String timezone;
	public int id;
	public String organizer_name;
	public String organizer_description;
	public String description;
	public CopyrightModel _copyright;
	public String state;
	public String schedule_published_on;
	public VersionModel _version;
	public String location_name;
	public String privacy;
	public String background_image;
	public String code_of_conduct;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String name;

	public RootModel(String email, String topic, String end_time, CreatorModel creator, ArrayList<Social_linksModel> social_links, String start_time, String logo, String timezone, int id, String organizer_name, String organizer_description, String description, CopyrightModel copyright, String state, String schedule_published_on, VersionModel version, String location_name, String privacy, String background_image, String code_of_conduct, String type, Call_for_papersModel call_for_papers, String name) {

		this.email = email;
		this.topic = topic;
		this.end_time = end_time;
		this._creator = creator;
		this.social_links = social_links;
		this.start_time = start_time;
		this.logo = logo;
		this.timezone = timezone;
		this.id = id;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.description = description;
		this._copyright = copyright;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.location_name = location_name;
		this.privacy = privacy;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.name = name;

	}

}