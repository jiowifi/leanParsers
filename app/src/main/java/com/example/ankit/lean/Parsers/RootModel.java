import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String organizer_name;
	public String email;
	public String privacy;
	public String end_time;
	public String schedule_published_on;
	public String code_of_conduct;
	public String name;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String description;
	public String type;
	public String location_name;
	public String state;
	public int id;
	public String organizer_description;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String topic;

	public RootModel(String timezone, String organizer_name, String email, String privacy, String end_time, String schedule_published_on, String code_of_conduct, String name, String start_time, Call_for_papersModel call_for_papers, CreatorModel creator, String description, String type, String location_name, String state, int id, String organizer_description, String logo, ArrayList<Social_linksModel> social_links, String background_image, VersionModel version, CopyrightModel copyright, String topic) {

		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.email = email;
		this.privacy = privacy;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.description = description;
		this.type = type;
		this.location_name = location_name;
		this.state = state;
		this.id = id;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.social_links = social_links;
		this.background_image = background_image;
		this._version = version;
		this._copyright = copyright;
		this.topic = topic;

	}

}