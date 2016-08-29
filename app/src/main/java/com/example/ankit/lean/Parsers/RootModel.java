import java.util.ArrayList;

class RootModel {

	public String email;
	public String description;
	public CopyrightModel _copyright;
	public String logo;
	public CreatorModel _creator;
	public String type;
	public String background_image;
	public int id;
	public String name;
	public String timezone;
	public String location_name;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String state;
	public String privacy;
	public String end_time;
	public String schedule_published_on;
	public String organizer_name;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String code_of_conduct;

	public RootModel(String email, String description, CopyrightModel copyright, String logo, CreatorModel creator, String type, String background_image, int id, String name, String timezone, String location_name, String organizer_description, Call_for_papersModel call_for_papers, String start_time, String state, String privacy, String end_time, String schedule_published_on, String organizer_name, String topic, ArrayList<Social_linksModel> social_links, VersionModel version, String code_of_conduct) {

		this.email = email;
		this.description = description;
		this._copyright = copyright;
		this.logo = logo;
		this._creator = creator;
		this.type = type;
		this.background_image = background_image;
		this.id = id;
		this.name = name;
		this.timezone = timezone;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.state = state;
		this.privacy = privacy;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.social_links = social_links;
		this._version = version;
		this.code_of_conduct = code_of_conduct;

	}

}