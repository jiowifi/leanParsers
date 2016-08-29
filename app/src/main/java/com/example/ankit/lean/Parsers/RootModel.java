import java.util.ArrayList;

class RootModel {

	public int id;
	public String location_name;
	public String organizer_description;
	public String description;
	public String type;
	public String start_time;
	public String timezone;
	public String email;
	public String state;
	public String privacy;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String end_time;
	public String organizer_name;
	public String logo;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String name;
	public CreatorModel _creator;
	public String background_image;
	public VersionModel _version;

	public RootModel(int id, String location_name, String organizer_description, String description, String type, String start_time, String timezone, String email, String state, String privacy, CopyrightModel copyright, Call_for_papersModel call_for_papers, String schedule_published_on, String end_time, String organizer_name, String logo, String code_of_conduct, ArrayList<Social_linksModel> social_links, String topic, String name, CreatorModel creator, String background_image, VersionModel version) {

		this.id = id;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.description = description;
		this.type = type;
		this.start_time = start_time;
		this.timezone = timezone;
		this.email = email;
		this.state = state;
		this.privacy = privacy;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.topic = topic;
		this.name = name;
		this._creator = creator;
		this.background_image = background_image;
		this._version = version;

	}

}