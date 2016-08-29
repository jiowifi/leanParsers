import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public int id;
	public String end_time;
	public String logo;
	public String background_image;
	public String organizer_name;
	public String type;
	public String topic;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public VersionModel _version;
	public String start_time;
	public String description;
	public String privacy;
	public String name;
	public String email;
	public String state;
	public CreatorModel _creator;
	public String code_of_conduct;

	public RootModel(String organizer_description, int id, String end_time, String logo, String background_image, String organizer_name, String type, String topic, CopyrightModel copyright, String schedule_published_on, Call_for_papersModel call_for_papers, String timezone, ArrayList<Social_linksModel> social_links, String location_name, VersionModel version, String start_time, String description, String privacy, String name, String email, String state, CreatorModel creator, String code_of_conduct) {

		this.organizer_description = organizer_description;
		this.id = id;
		this.end_time = end_time;
		this.logo = logo;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.type = type;
		this.topic = topic;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.social_links = social_links;
		this.location_name = location_name;
		this._version = version;
		this.start_time = start_time;
		this.description = description;
		this.privacy = privacy;
		this.name = name;
		this.email = email;
		this.state = state;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;

	}

}