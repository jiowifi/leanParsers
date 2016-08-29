import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String email;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String background_image;
	public String organizer_description;
	public String description;
	public String privacy;
	public String timezone;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String start_time;
	public CopyrightModel _copyright;
	public String state;
	public VersionModel _version;
	public String type;
	public String topic;
	public String logo;
	public String name;

	public RootModel(String code_of_conduct, String email, String organizer_name, ArrayList<Social_linksModel> social_links, String location_name, String end_time, Call_for_papersModel call_for_papers, int id, String background_image, String organizer_description, String description, String privacy, String timezone, String schedule_published_on, CreatorModel creator, String start_time, CopyrightModel copyright, String state, VersionModel version, String type, String topic, String logo, String name) {

		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.location_name = location_name;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.description = description;
		this.privacy = privacy;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.start_time = start_time;
		this._copyright = copyright;
		this.state = state;
		this._version = version;
		this.type = type;
		this.topic = topic;
		this.logo = logo;
		this.name = name;

	}

}