import java.util.ArrayList;

class RootModel {

	public String description;
	public String location_name;
	public String topic;
	public String name;
	public String start_time;
	public String state;
	public CopyrightModel _copyright;
	public int id;
	public String privacy;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String schedule_published_on;
	public String organizer_description;
	public String email;
	public String timezone;
	public String code_of_conduct;
	public String type;
	public CreatorModel _creator;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String logo;

	public RootModel(String description, String location_name, String topic, String name, String start_time, String state, CopyrightModel copyright, int id, String privacy, String end_time, ArrayList<Social_linksModel> social_links, String background_image, String schedule_published_on, String organizer_description, String email, String timezone, String code_of_conduct, String type, CreatorModel creator, VersionModel version, Call_for_papersModel call_for_papers, String organizer_name, String logo) {

		this.description = description;
		this.location_name = location_name;
		this.topic = topic;
		this.name = name;
		this.start_time = start_time;
		this.state = state;
		this._copyright = copyright;
		this.id = id;
		this.privacy = privacy;
		this.end_time = end_time;
		this.social_links = social_links;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.email = email;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this._creator = creator;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.logo = logo;

	}

}