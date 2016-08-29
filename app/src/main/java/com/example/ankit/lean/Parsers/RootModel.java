import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String topic;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String privacy;
	public String email;
	public String description;
	public String name;
	public String logo;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String end_time;
	public String type;
	public String background_image;
	public String state;
	public int id;
	public VersionModel _version;
	public String location_name;
	public String organizer_description;

	public RootModel(Call_for_papersModel call_for_papers, String start_time, String topic, String code_of_conduct, CopyrightModel copyright, CreatorModel creator, String schedule_published_on, String privacy, String email, String description, String name, String logo, String organizer_name, ArrayList<Social_linksModel> social_links, String timezone, String end_time, String type, String background_image, String state, int id, VersionModel version, String location_name, String organizer_description) {

		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.email = email;
		this.description = description;
		this.name = name;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.timezone = timezone;
		this.end_time = end_time;
		this.type = type;
		this.background_image = background_image;
		this.state = state;
		this.id = id;
		this._version = version;
		this.location_name = location_name;
		this.organizer_description = organizer_description;

	}

}