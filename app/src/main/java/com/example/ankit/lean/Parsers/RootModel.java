import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public int id;
	public String timezone;
	public CopyrightModel _copyright;
	public String end_time;
	public String email;
	public String privacy;
	public String organizer_name;
	public String logo;
	public String location_name;
	public VersionModel _version;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String start_time;
	public String description;
	public String name;
	public String schedule_published_on;
	public String topic;
	public String organizer_description;

	public RootModel(String code_of_conduct, CreatorModel creator, ArrayList<Social_linksModel> social_links, String state, int id, String timezone, CopyrightModel copyright, String end_time, String email, String privacy, String organizer_name, String logo, String location_name, VersionModel version, String type, Call_for_papersModel call_for_papers, String background_image, String start_time, String description, String name, String schedule_published_on, String topic, String organizer_description) {

		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.social_links = social_links;
		this.state = state;
		this.id = id;
		this.timezone = timezone;
		this._copyright = copyright;
		this.end_time = end_time;
		this.email = email;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.location_name = location_name;
		this._version = version;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.start_time = start_time;
		this.description = description;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.organizer_description = organizer_description;

	}

}