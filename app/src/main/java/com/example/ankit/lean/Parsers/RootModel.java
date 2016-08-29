import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String email;
	public String privacy;
	public String timezone;
	public String name;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String type;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String description;
	public String topic;
	public String organizer_name;
	public int id;
	public String background_image;
	public String end_time;
	public String organizer_description;
	public String state;

	public RootModel(String code_of_conduct, VersionModel version, CopyrightModel copyright, CreatorModel creator, String email, String privacy, String timezone, String name, String start_time, ArrayList<Social_linksModel> social_links, String schedule_published_on, String type, String logo, Call_for_papersModel call_for_papers, String location_name, String description, String topic, String organizer_name, int id, String background_image, String end_time, String organizer_description, String state) {

		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this._copyright = copyright;
		this._creator = creator;
		this.email = email;
		this.privacy = privacy;
		this.timezone = timezone;
		this.name = name;
		this.start_time = start_time;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.description = description;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.id = id;
		this.background_image = background_image;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.state = state;

	}

}