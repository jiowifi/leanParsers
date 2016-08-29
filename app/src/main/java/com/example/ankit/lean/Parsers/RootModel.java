import java.util.ArrayList;

class RootModel {

	public String email;
	public String organizer_description;
	public String name;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String privacy;
	public String code_of_conduct;
	public String background_image;
	public String description;
	public String location_name;
	public String end_time;
	public String state;
	public CopyrightModel _copyright;
	public String timezone;
	public String start_time;
	public String logo;
	public String schedule_published_on;
	public int id;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String type;

	public RootModel(String email, String organizer_description, String name, CreatorModel creator, Call_for_papersModel call_for_papers, String organizer_name, String privacy, String code_of_conduct, String background_image, String description, String location_name, String end_time, String state, CopyrightModel copyright, String timezone, String start_time, String logo, String schedule_published_on, int id, VersionModel version, ArrayList<Social_linksModel> social_links, String topic, String type) {

		this.email = email;
		this.organizer_description = organizer_description;
		this.name = name;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.description = description;
		this.location_name = location_name;
		this.end_time = end_time;
		this.state = state;
		this._copyright = copyright;
		this.timezone = timezone;
		this.start_time = start_time;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this._version = version;
		this.social_links = social_links;
		this.topic = topic;
		this.type = type;

	}

}