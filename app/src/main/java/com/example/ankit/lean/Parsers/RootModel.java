import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String code_of_conduct;
	public String description;
	public String email;
	public String topic;
	public CopyrightModel _copyright;
	public String organizer_name;
	public CreatorModel _creator;
	public String end_time;
	public String state;
	public int id;
	public String timezone;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String type;
	public String organizer_description;
	public String privacy;
	public String logo;
	public String name;
	public String start_time;

	public RootModel(String schedule_published_on, Call_for_papersModel call_for_papers, VersionModel version, String code_of_conduct, String description, String email, String topic, CopyrightModel copyright, String organizer_name, CreatorModel creator, String end_time, String state, int id, String timezone, String background_image, ArrayList<Social_linksModel> social_links, String location_name, String type, String organizer_description, String privacy, String logo, String name, String start_time) {

		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.email = email;
		this.topic = topic;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.end_time = end_time;
		this.state = state;
		this.id = id;
		this.timezone = timezone;
		this.background_image = background_image;
		this.social_links = social_links;
		this.location_name = location_name;
		this.type = type;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.logo = logo;
		this.name = name;
		this.start_time = start_time;

	}

}